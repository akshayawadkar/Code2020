import java.util.*;

public class _17_SodokuChecker {
	 public static boolean isValidSudoku(char[][] board) {
	        
	        
	        Set<String> set = new HashSet<>();
	        
	        for(int i = 0; i < board.length; i++){
	            for(int j = 0; j < board.length; j++){
	                if(board[i][j] != '.'){
	                    
	                    String row = board[i][j] + "row"+ i;
	                    String col = board[i][j] + "col"+ j;
	                    String box = board[i][j] + "box"+ (i / 3) + " - "+ (j / 3);
	        
	                    if(set.contains(row)){
	                        return false;
	                    }
	                    set.add(row);
	                    
	                     if(set.contains(col)){
	                        return false;
	                    }
	                    set.add(col);
	                    
	                    if(set.contains(box)){
	                        return false;
	                    }
	                    set.add(box);
	                }
	            }
	        }
	        
	        return true;
	        
	    }
	
	public static void main(String[] args) {
		
	}

}
