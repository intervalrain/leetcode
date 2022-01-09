package com.rainhu;

/**
 * 1041. Robot Bounded in Circle (Medium)
 * 
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
 * 
 *     + "G": go straight 1 unit;
 *     + "L": turn 90 degrees to the left;
 *     + "R": turn 90 degrees to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 */

public class n1041_RobotBoundedInCircle {
    private class Robot{
        int x;
        int y;
        int[][] directions = {{1,0},{0,-1},{-1,0},{0,1}};
        int status;
        int[] dir;
        Robot(){
            x = 0;
            y = 0;
            status = 0;
            dir = directions[status];
        }
        void go(char ch){
            if (ch == 'L'){
                status = (status + 3) % 4;
                dir = directions[status];
            } else if (ch == 'R'){
                status = (status + 1) % 4;
                dir = directions[status];
            } else if (ch == 'G'){
                x += dir[0];
                y += dir[1];
            }
        }
        void instruct(String instructions){
            for (char instruction : instructions.toCharArray()){
                go(instruction);
            }
        }
        boolean isAtOrigin(){
            return x == 0 && y == 0;
        }
    }
    public boolean isRobotBounded(String instructions){
        Robot robot = new Robot();
        for (int i = 0; i < 4; i++){
            robot.instruct(instructions);
        }
        return robot.isAtOrigin();
    }
}
