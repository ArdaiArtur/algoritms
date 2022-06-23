package Day1;

import java.util.PriorityQueue;

public class FirstBadVersion {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(20);
        pq.add(40);
        System.out.println(pq); //prints [2, 4]
        pq.add(100);
        System.out.println(pq); // prints [1, 4, 2]
        pq.add(322);
        System.out.println(pq); // prints [1, 3, 2, 4]
        pq.add(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        

    
    }

   
        public static int FirstBadVersion(int n) {
           int start=0, end=n;
            while(start<end){
                int mid = start + (end-start)/2;
                if (mid!=n){
                    end=mid;
                } else {
                    start=mid+1;
                }
            }
            return start;
        }
        }

