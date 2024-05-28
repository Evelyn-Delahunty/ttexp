int rows = 3;
int cols = 5;
int exp = 1;

void setup(){
  printArray(TTE.ttexp(rows, cols, exp));
}

void draw(){
}

void printArray(int[][] in){
  for(int[] rowArray : in){
    for(int j : rowArray){
      System.out.print(j + "\t");
    }
    System.out.println("\n \n");
  }
}
