class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c=='.')continue;

                if(set.contains(c)){
                    return false;
                }
                set.add(c);
            }
        }

        for(int i=0;i<9;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                char c=board[j][i];
                if(c=='.')continue;

                if(set.contains(c)){
                    return false;
                }
                set.add(c);
            }
        }
        for(int block=0;block<9;block++){
            int row= (block/3)*3;
            int col=(block%3)*3;
            HashSet<Character>set= new HashSet<>();
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                    char c= board[row+i][col+j];

                    if(c=='.')continue;
                    if(set.contains(c)){
                        return false;
                    }
                    set.add(c);
                }
            }
        }
        return true;
    }
}
