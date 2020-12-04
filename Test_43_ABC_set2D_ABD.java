/**
	 * Testing for IndexedUnsortedList ADT implementation: 
	 * Tests for Change Scenario 43: [A,B,C] -> SET(2,D) -> [A, B, C]
	 * 
	 * @author CS 221
	 */
public class Test_43_ABC_set2D_ABD {


		// List running tests on
		IndexedUnsortedList<Character> list;
		
		//****** Constants used in tests *****************
			// Name of class
			private static String CLASS_NAME = "Test_43_ABC_set2D_ABD"; 
			// Description of change scenario testing 
			private static final String testDescription = 
					"Change Scenario 43: [A, B, C] -> set(2, D) -> [A, B, D]"; 
			// Number of tests run 
			private static final int NUM_TESTS = 47; 
			// Type of list using in tests
			private ListType listType; 

			// First element in list
			private static final Character FIRST = IndexedUnsortedListTests.A;
			//Second element in list
			private static final Character SEC = IndexedUnsortedListTests.B;
			// Last element in list 
			private static final Character LAST = IndexedUnsortedListTests.D;	
			// First valid index inside of list 
			private static final int FIRST_INDEX = 0;
			// Second valid index inside of list 
			private static final int SEC_INDEX = 1;
			// Last valid index inside of list 
			private static final int LAST_INDEX = 2;
			// First negative invalid index outside of list 
			private static final int NEG_INVALID_INDEX = -1;
			// First positive invalid index outside of list 
			private static final int POS_INVALID_INDEX = 3;
			// First valid index where can add a new element 
			private static final int VALID_ADD_INDEX_0 = 0; 
			// Second valid index where can add a new element 
			private static final int VALID_ADD_INDEX_1 = 1; 
			// Third valid index where can add a new element 
			private static final int VALID_ADD_INDEX_2 = 2;
			//Forth valid index where can add a new element 
			private static final int VALID_ADD_INDEX_3 = 3;
			// First negative index outside valid add range
			private static final int NEG_INVALID_ADD_INDEX = -1;
			// First positive index outside valid add range
			private static final int POS_INVALID_ADD_INDEX = 4;
			// Size of the list 
			private static final int SIZE = 3; 
				
		//****** Don't change these constants *****************
			
			// An element not in list 
			private static final Character ELEMENT = IndexedUnsortedListTests.E; 
			// Another element not in list - used for negative testing 
			private static final Character INVALID_ELEMENT = IndexedUnsortedListTests.F;

		/**
		 * Sets up list for testing. 
		 */
		public void initialize()
		{
			// initial state of list
			list = IndexedUnsortedListTests.newList(listType);
			list.add(IndexedUnsortedListTests.A);
			list.add(IndexedUnsortedListTests.B);
			list.add(IndexedUnsortedListTests.C);
			// apply change 
			list.set(2, IndexedUnsortedListTests.D);
		}

		/** 
		 * Run tests for this change scenario 
		 */
		public void run(ListType listType)
		{
			// set type of list running tests on 
			this.listType = listType; 
			
			// result of running tests 
			boolean result; 
			
			try 
			{
		//REMOVE TESTS (11)
				// Test: removeFirst() 
				initialize(); 
				result = IndexedUnsortedListTests.removeFirst(list, FIRST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("removeFirst()", result);		
		
				// Test: removeLast()
				initialize(); 
				result = IndexedUnsortedListTests.removeLast(list, LAST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("removeLast()", result);
				
				// Test: remove(FIRST) *********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, FIRST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(FIRST)", result);
				
				// Test: remove(SEC) *********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, SEC, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(SEC)", result);
				
				// Test: remove(LAST) *********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, LAST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(LAST)", result);
				
				// Test: remove(INVALID_ELEMENT) *********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, INVALID_ELEMENT, Result.NoSuchElement); 
				RunIndexedUnsortedTests.printResults("remove(INVALID_ELEMENT)", result);
				
				// Test: remove(FIRST_INDEX) **********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, FIRST_INDEX, FIRST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(FIRST_INDEX)", result);
				
				// Test: remove(SEC_INDEX) **********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, SEC_INDEX, SEC, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(SEC_INDEX)", result);
							
				// Test: remove(LAST_INDEX) **********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, LAST_INDEX, LAST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("remove(LAST_INDEX)", result);
				
				// Test: remove(NEG_INVALID_INDEX) **********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, NEG_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("remove(NEG_INVALID_INDEX, ELEMENT)", result);
							
				// Test: remove(POS_INVALID_INDEX) **********
				initialize(); 
				result = IndexedUnsortedListTests.remove(list, POS_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("remove(INVALID_INDEX, ELEMENT)", result);
		
		//OTHER TESTS (9)
				// Test: first()
				initialize(); 
				result = IndexedUnsortedListTests.first(list, FIRST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("first()", result);
				
				// Test: last()
				initialize(); 
				result = IndexedUnsortedListTests.last(list, LAST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("last()", result);
				
				// Test: contains(FIRST) ************
				initialize(); 
				result = IndexedUnsortedListTests.contains(list, FIRST, Result.True); 
				RunIndexedUnsortedTests.printResults("contains(FIRST)", result);
				
				// Test: contains(SEC) ************
				initialize(); 
				result = IndexedUnsortedListTests.contains(list, SEC, Result.True); 
				RunIndexedUnsortedTests.printResults("contains(SEC)", result);
		
				// Test: contains(LAST) ************
				initialize(); 
				result = IndexedUnsortedListTests.contains(list, LAST, Result.True); 
				RunIndexedUnsortedTests.printResults("contains(LAST)", result);
				
				// Test: contains(INVALID_ELEMENT) ************
				initialize(); 
				result = IndexedUnsortedListTests.contains(list, INVALID_ELEMENT, Result.False); 
				RunIndexedUnsortedTests.printResults("contains(INVALID_ELEMENT)", result);
				
				// Test: isEmpty()
				initialize(); 
				result = IndexedUnsortedListTests.isEmpty(list, Result.False); 
				RunIndexedUnsortedTests.printResults("isEmpty()", result);
				
				// Test: size()
				initialize(); 
				result = IndexedUnsortedListTests.size(list, SIZE); 
				RunIndexedUnsortedTests.printResults("size()", result);
				
				// Test: iterator()
				initialize(); 
				result = IndexedUnsortedListTests.iterator(list); 
				RunIndexedUnsortedTests.printResults("iterator()", result);
							
		//ADD TESTS (13)
				
				// Test: add(ELEMENT)
				initialize(); 
				result = IndexedUnsortedListTests.add(list, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("add(ELEMENT)", result);			
						
				// Test: addToFront(ELEMENT)
				initialize(); 
				result = IndexedUnsortedListTests.addToFront(list, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("addToFront(ELEMENT)", result);
				
				// Test: addToRear(ELEMENT)
				initialize(); 
				result = IndexedUnsortedListTests.addToRear(list, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("addToRear(ELEMENT)", result);
				
				// Test: addAfter(ELEMENT, FIRST)  *************
				initialize(); 
				result = IndexedUnsortedListTests.addAfter(list, ELEMENT, FIRST, Result.NoException); 
				RunIndexedUnsortedTests.printResults("addAfter(ELEMENT, FIRST)", result);
				
				// Test: addAfter(ELEMENT, SEC)  *************
				initialize(); 
				result = IndexedUnsortedListTests.addAfter(list, ELEMENT, SEC, Result.NoException); 
				RunIndexedUnsortedTests.printResults("addAfter(ELEMENT, SEC)", result);
							
				// Test: addAfter(ELEMENT, LAST)  *************
				initialize(); 
				result = IndexedUnsortedListTests.addAfter(list, ELEMENT, LAST, Result.NoException); 
				RunIndexedUnsortedTests.printResults("addAfter(ELEMENT, LAST)", result);
				
				// Test: addAfter(ELEMENT, INVALID_ELEMENT)  *************
				initialize(); 
				result = IndexedUnsortedListTests.addAfter(list, ELEMENT, INVALID_ELEMENT, Result.NoSuchElement); 
				RunIndexedUnsortedTests.printResults("addAfter(ELEMENT, INVALID_ELEMENT)", result);
				
				// Test: add(VALID_ADD_INDEX_0, ELEMENT) **************
				initialize(); 
				result = IndexedUnsortedListTests.add(list, VALID_ADD_INDEX_0, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("add(VALID_ADD_INDEX_0, ELEMENT)", result);
				
				// Test: add(VALID_ADD_INDEX_1, ELEMENT) **************
				initialize(); 
				result = IndexedUnsortedListTests.add(list, VALID_ADD_INDEX_1, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("add(VALID_ADD_INDEX_1, ELEMENT)", result);
				
				// Test: add(VALID_ADD_INDEX_2, ELEMENT) **************
				initialize(); 
				result = IndexedUnsortedListTests.add(list, VALID_ADD_INDEX_2, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("add(VALID_ADD_INDEX_2, ELEMENT)", result);
				
				// Test: add(VALID_ADD_INDEX_3, ELEMENT) **************
				initialize(); 
				result = IndexedUnsortedListTests.add(list, VALID_ADD_INDEX_3, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("add(VALID_ADD_INDEX_3, ELEMENT)", result);
				
				// add(NEG_INVALID_ADD_INDEX, ELEMENT)
				initialize(); 
				result = IndexedUnsortedListTests.add(list, NEG_INVALID_ADD_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("add(NEG_INVALID_ADD_INDEX, ELEMENT)", result);
				
				// add(POS_INVALID_ADD_INDEX, ELEMENT)
				initialize(); 
				result = IndexedUnsortedListTests.add(list, POS_INVALID_ADD_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("add(POS_INVALID_ADD_INDEX, ELEMENT)", result);
		//SET TESTS (5)
				// Test: set(FIRST_INDEX, ELEMENT) ********
				initialize(); 
				result = IndexedUnsortedListTests.set(list, FIRST_INDEX, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("set(FIRST_INDEX, ELEMENT)", result);
				
				// Test: set(SEC_INDEX, ELEMENT) ********
				initialize(); 
				result = IndexedUnsortedListTests.set(list, SEC_INDEX, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("set(SEC_INDEX, ELEMENT)", result);
							
							
				// Test: set(LAST_INDEX, ELEMENT) ********
				initialize(); 
				result = IndexedUnsortedListTests.set(list, LAST_INDEX, ELEMENT, Result.NoException); 
				RunIndexedUnsortedTests.printResults("set(LAST_INDEX, ELEMENT)", result);
				
				// Test: set(NEG_INVALID_INDEX, ELEMENT) ********
				initialize(); 
				result = IndexedUnsortedListTests.set(list, NEG_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("set(NEG_INVALID_INDEX, ELEMENT)", result);
				
				// Test: set(POS_INVALID_INDEX, ELEMENT) ********
				initialize(); 
				result = IndexedUnsortedListTests.set(list, POS_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("set(POS_INVALID_INDEX, ELEMENT)", result);
		//GET TESTS (5)
				// Test: get(FIRST_INDEX) ***************
				initialize(); 
				result = IndexedUnsortedListTests.get(list, FIRST_INDEX, FIRST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("get(FIRST_INDEX)", result);
				
				// Test: get(SEC_INDEX) ***************
				initialize(); 
				result = IndexedUnsortedListTests.get(list, SEC_INDEX, SEC, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("get(SEC_INDEX)", result);
		
				// Test: get(LAST_INDEX) ***************
				initialize(); 
				result = IndexedUnsortedListTests.get(list, LAST_INDEX, LAST, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("get(LAST_INDEX)", result);
				
				// Test: get(NEG_INVALID_INDEX) ***************
				initialize(); 
				result = IndexedUnsortedListTests.get(list, NEG_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("get(NEG_INVALID_INDEX)", result);
				
				// Test: get(POS_INVALID_INDEX) ***************
				initialize(); 
				result = IndexedUnsortedListTests.get(list, POS_INVALID_INDEX, ELEMENT, Result.IndexOutOfBounds); 
				RunIndexedUnsortedTests.printResults("get(POS_INVALID_INDEX)", result);
		//INDEXOF TESTS (4)
				// Test: indexOf(FIRST) ***********
				initialize(); 
				result = IndexedUnsortedListTests.indexOf(list, FIRST, FIRST_INDEX, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("indexOf(FIRST)", result);
			
				// Test: indexOf(SEC) ***********
				initialize(); 
				result = IndexedUnsortedListTests.indexOf(list, SEC, SEC_INDEX, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("indexOf(SEC)", result);
		
				// Test: indexOf(LAST) ***********
				initialize(); 
				result = IndexedUnsortedListTests.indexOf(list, LAST, LAST_INDEX, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("indexOf(LAST)", result);
					
				// Test: indexOf(INVALID_ELEMENT) ***********
				initialize(); 
				result = IndexedUnsortedListTests.indexOf(list, INVALID_ELEMENT, NEG_INVALID_INDEX, Result.MatchingValue); 
				RunIndexedUnsortedTests.printResults("indexOf(INVALID_ELEMENT)", result);
					
			} 
			catch (Exception e) 
			{
				System.out.printf("***UNABLE TO RUN/COMPLETE %s***\n", CLASS_NAME);
				e.printStackTrace();
			}
		}
		
		/**
		 * Returns test description 
		 * @return testDescription - description of test
		 */
		public String getDescription()
		{
			return testDescription;
		}
		
		/**
		 * Returns number of tests in this test class 
		 * @return - int representing number of tests 
		 */
		public int getNumTests()
		{
			return NUM_TESTS; 
		}

	}



