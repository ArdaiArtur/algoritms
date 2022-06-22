package Day1;

public class FirstBadVersion {
    public static void main(String[] args) {
        
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

