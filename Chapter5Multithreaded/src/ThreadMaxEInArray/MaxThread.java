/**
 * 
 */
package ThreadMaxEInArray;

/**
 * @author hv
 *
 */
public class MaxThread extends Thread {

    private int lo, hi;
    private int[] arr;
    private int max = 0;
    
    public MaxThread(int lo, int hi, int[] arr) {
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
            this.max = Math.max(this.arr[i], this.max);
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
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param sum the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }
}
