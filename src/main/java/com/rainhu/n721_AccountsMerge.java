package com.rainhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 721. Account Merge (Medium)
 * 
 * Given a list of accounts where each element accounts[i] is a list of strings,
 * where the first element accounts[i][0] is a name,
 * and the rest of the elements are emails representing emails of the account.
 * 
 * Now, we would like to merge these accounts.
 * Two accounts definitely belong to the same person if there is some common email to both accounts.
 * Note that even if two accounts have the same name,
 * they may belong to different people as people could have the same name.
 * A person can have any number of accounts initially,
 * but all of their accounts definitely have the same name.
 * 
 * After merging the accounts,
 * return the accounts in the following format:
 * the first element of each account is the name,
 * and the rest of the elements are emails in sorted order.
 * The accounts themselves can be returned in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/30
 * @apiNote: 
 */

public class n721_AccountsMerge {

    private static class IndexInfo{
        String name;
        int size = 0;
        List<String> email = new ArrayList<String>();
        boolean valid = true;
        public IndexInfo(String name){
            this.name = name;
        }
    }

    private int globalIndex = 0;
    private Map<String, Integer> emailIdMap = new HashMap<String,Integer>();
    private List<IndexInfo> indexSize = new ArrayList<IndexInfo>();

    private int findIndex(List<String> account){
        int index = -1;
        int maxSize = 0;
        String name = account.get(0);
        for (int i=1;i<account.size();i++){
            String email = account.get(i);
            if (emailIdMap.containsKey(email)){
                int emailIndex = emailIdMap.get(email);
                if (indexSize.get(emailIndex).size > maxSize){
                    maxSize = indexSize.get(emailIndex).size;
                    index = emailIndex;
                }
            }
        }
        if (index != -1){
            return index;
        }
        
        IndexInfo indexInfo = new IndexInfo(name);
        indexSize.add(indexInfo);
        globalIndex++;
        return globalIndex-1;
    }
    
    private void setIndex(int index, List<String> account){
        IndexInfo indexInfo = indexSize.get(index);
        for (int i=1;i<account.size();i++){
            String email = account.get(i);
            if (!emailIdMap.containsKey(email)){
                emailIdMap.put(email,index);
                indexInfo.size++;
                indexInfo.email.add(email);
                continue;
            }
            if (emailIdMap.get(email) == index){
                continue;
            }
            IndexInfo newIndexInfo = indexSize.get(emailIdMap.get(email));
            newIndexInfo.valid = false;
            indexInfo.size += newIndexInfo.size;
            for (String newEmail : newIndexInfo.email){
                emailIdMap.put(newEmail,index);
                indexInfo.email.add(newEmail);
            }
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts){
        if (accounts == null || accounts.size() <= 1){
            return accounts;
        }
        for (List<String> account : accounts){
            if (account.size()<=1) {continue;}
            // String name = account.get(0);
            int index = findIndex(account);
            setIndex(index,account);
        }
        List<List<String>> ret = new ArrayList<List<String>>();
        for (IndexInfo indexInfo: indexSize){
            if (!indexInfo.valid){
                continue;
            }
            Collections.sort(indexInfo.email);
            indexInfo.email.add(0,indexInfo.name);
            ret.add(indexInfo.email);
        }
        return ret;
    }
}
