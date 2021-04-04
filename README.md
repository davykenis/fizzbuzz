# fizzbuzz
FizzBuzz TDD kata

## STEP 1: Add a first test failing test

    @Test
    public void FizzBuzz_0is0()
    {
        assertEquals("0",FizzBuzz.of(0));
    }
    
    
## STEP 2: Fix the failing test

        if (i == 0) {
            return "0";
        }
        
## STEP 3: Add other tests
FizzBuzz1, FizzBuzz3, FizzBuzz5, ....

## STEP 4: Fix test
Note: Mind the FizzBuzz 15, you might want to change code order to avoid BuzzFizz

## STEP 4: Refactor untill you reach clean code :-)
Note: You might want to add a seperate class to seperate code logic from exceptions like 0


  
    
    
