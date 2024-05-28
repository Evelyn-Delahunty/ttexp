class TTE{
  
  TTE(){
  }
  
  public static int[][] ttexp(int rows_, int cols_, int exp_){
    int[][] out = new int[rows_][cols_];
    for(int i = 0; i < rows_; i++){
      for(int j = 0; j < cols_; j++){
        out[i][j] = (int)Math.pow((double)(j + 1 + i * cols_), (double)exp_);
      }
    }
    return(out);
  }
}
