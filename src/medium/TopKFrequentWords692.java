package medium;

import java.util.*;

public class TopKFrequentWords692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int val = map.getOrDefault(word, 0);
            map.put(word, val + 1);
        }
        PriorityQueue<WordCount> pq = new PriorityQueue<>((a, b) -> {
            if (a.count == b.count) {
                return a.word.compareTo(b.word);
            } else return Integer.compare(b.count, a.count);
        });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new WordCount(entry.getKey(), entry.getValue()));
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll().word);
        }
        return res;
    }

    class WordCount {
        String word;
        int count;

        public WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    // Best solution
//    public List<String> topKFrequent(String[] words, int k) {
//        Map<String,Obj> map = new HashMap<>();
//        List<Obj>  obj = new ArrayList<>();
//        for(String s : words){
//            Obj cur = map.get(s);
//            if(cur==null){
//                cur = new Obj(s);
//                obj.add(cur);
//                map.put(s,cur);
//            }
//            cur.freq++;
//        }
//        //for(int i=0;i<obj.size();i++){
//        //   ans.add(obj.get(i).s);
//        //}
//        mergeSort(obj,0,obj.size()-1);
//        List<String> ans = new ArrayList<>();
//        for(int i=0;i<k;i++){
//            ans.add(obj.get(i).s);
//        }
//        return ans;
//    }
//
//    public static void mergeSort(List<Obj> obj ,int start,int end){
//        if(start<end){
//            int mid = (start+end)/2;
//
//            mergeSort(obj,start,mid);
//            mergeSort(obj,mid+1,end);
//
//            merge(obj,start,mid,end);
//
//        }
//    }
//
//    public static void merge(List<Obj> obj,int start,int mid,int end){
//        int l =start;
//        int r=mid+1;
//        int k =0;
//        Obj[] temp = new Obj[end-start+1];
//        while(l<=mid && r<=end){
//            Obj left = obj.get(l);
//            Obj right = obj.get(r);
//            if(left.freq < right.freq){
//                temp[k]= right;
//                r++;
//            }
//            else if(left.freq > right.freq){
//                temp[k] = left;
//                l++;
//            }
//            else{
//                int cur = left.s.compareTo(right.s);
//                if(cur<0){
//                    temp[k] = left;
//                    l++;
//                }
//                else{
//                    temp[k]= right;
//                    r++;
//                }
//            }
//            k++;
//        }
//        while(l<=mid){
//            temp[k]=obj.get(l);
//            l++;
//            k++;
//        }
//        while(r<=end){
//            temp[k] =obj.get(r);
//            r++;
//            k++;
//        }
//
//        for(int i =0;i<temp.length;i++){
//            obj.set(start+i,temp[i]);
//        }
//    }
//    class Obj {
//        String s;
//        int freq;
//
//        Obj(String s) {
//            freq = 0;
//            this.s = s;
//        }
//    }

}
