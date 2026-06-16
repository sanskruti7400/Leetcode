class Solution {

    public static boolean isFriend(int id,int[] friends){
        for(int i=0;i<friends.length;i++){
            if(id ==friends[i]){
                return true;
            }
        }
        return false;
    }

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] finish=new int[friends.length];
        int index=0;
        for(int i=0;i<order.length;i++){
            int id=order[i];
            if(isFriend(id,friends)){
                finish[index++]=id;
            }
        }
        return finish;
    }
}
