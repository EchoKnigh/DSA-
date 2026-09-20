class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list= new ArrayList<>();
        if(matrix.length==0)return list;
        int m=matrix.length;
        int n=matrix[0].length;

        int top=0;
        int down=m-1;
        int left=0;
        int right=n-1;

        int id=0;
        while(top<=down && left<=right){
            if(id==0){
                for( int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }
            if(id==1){
                for( int i=top;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if(id==2){
                for( int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }
            if(id==3){
                for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

            id=(id+1)%4;
            
        }


        // int id=0;
        // while(top<=down && left<=right){
        //     if(id==0){
        //         for(int i=left;i<=right;i++){
        //             list.add(matrix[top][i]);
        //         }
        //         top++;
        //     }
        //     if(id==1){
        //         for(int i=top;i<=down;i++){
        //             list.add(matrix[i][right]);
        //         }
        //         right--;
        //     }
        //     if(id==2){
        //         for(int i=right;i>=left;i--){
        //             list.add(matrix[down][i]);
        //         }
        //         down--;

        //     }
        //     if(id==3){
        //         for(int i=down;i>=top;i--){
        //             list.add(matrix[i][left]);
        //         }
        //         left++;

        //     }
        //     id=(id+1)%4;
        // }
        return list;
    }
}