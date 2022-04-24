package com.rainhu;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1396. Design Underground System
 * 
 * An underground railway system is keeping track of customer travel times between different stations. 
 * They are using this data to calculate the average time it takes to travel from one station to another.
 * 
 * Implement the UndergroundSystem class:
 *      + void checkIn(int id, string stationName, int t)
 *          + A customer with a card ID equal to id, checks in at the station stationName at time t.
 *          + A customer can only be checked into one place at a time.
 *      + void checkOut(int id, string stationName, int t)
 *          + A customer with a card ID equal to id, checks out from the station stationName at time t.
 *      + double getAverageTime(string startStation, string endStation)
 *          + Returns the average time it takes to travel from startStation to endStation.
 *          + The average time is computed from all the previous traveling times from startStation to endStation that happened directly, meaning a check in at startStation followed by a check out from endStation.
 *          + The time it takes to travel from startStation to endStation may be different from the time it takes to travel from endStation to startStation.
 *          + There will be at least one customer that has traveled from startStation to endStation before getAverageTime is called.
 * 
 * You may assume all calls to the checkIn and checkOut methods are consistent.
 * If a customer checks in at time t1 then checks out at time t2, 
 * then t1 < t2. All events happen in chronological order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/24
 * @apiNote: 
 */

public class n1396_DesignUndergroundSystem {
    Map<Integer, List<String>> checkInMap = new HashMap<>();
    Map<String, List<Double>> routeMap = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        List<String> list = new ArrayList<>();
        list.add(stationName);
        list.add(Integer.toString(t));
        checkInMap.put(id, list);
    }

    public void checkOut(int id, String stationName, int t) {
        List<String> checkIn = checkInMap.get(id);
        checkInMap.remove(id);

        String routeName = checkIn.get(0) + "_" + stationName;
        int totalTime = t - Integer.parseInt(checkIn.get(1));
        List<Double> route = routeMap.getOrDefault(routeName, List.of(0.0, 0.0));
        routeMap.put(routeName, List.of(route.get(0) + totalTime, route.get(1) + 1));
    }

    public double getAverageTime(String startStation, String endStation) {
        String routeName = startStation + "_" + endStation;
        List<Double> trip = routeMap.get(routeName);
        return trip.get(0) / trip.get(1);
    }
}
