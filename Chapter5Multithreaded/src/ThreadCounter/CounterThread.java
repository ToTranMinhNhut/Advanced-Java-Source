/**
 * 
 */
package ThreadCounter;

/**
 * @author hv
 *
 */
public class CounterThread extends Thread{

    private int lo, hi;
    private int[] arr;
    private int sum = 0;
    
    public CounterThread(int lo, int hi, int[] arr) {
        super();
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        for (int i = this.lo; i < this.hi; i++ ) {
            this.sum++;
        }
    }

    /**
     * @return the lo
     */
    public int getLo() {
        return lo;
    }

    /**
     * @param lo the lo to set
     */
    public void setLo(int lo) {
        this.lo = lo;
    }

    /**
     * @return the hi
     */
    public int getHi() {
        return hi;
    }

    /**
     * @param hi the hi to set
     */
    public void setHi(int hi) {
        this.hi = hi;
    }

    /**
     * @return the arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }
}
