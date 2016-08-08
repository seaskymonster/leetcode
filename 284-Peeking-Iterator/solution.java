// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    pirvate ArrayList<Integer> peek;
    private Iterator<Integer> iter;


	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
	    peek = new ArrayList<Integer>();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        int result = iter.next();
        peek.add(result);
        return result;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return iter.next();
	}

	@Override
	public boolean hasNext() {
	    return iter.hasNext();
	}
}