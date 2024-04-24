class Solution {
    public int minAreaRect(int[][] points) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int[] p : points){
            if(!map.containsKey(p[0])){
                map.put(p[0],new HashSet<>());
            }
            map.get(p[0]).add(p[1]);
        }
        int ans=Integer.MAX_VALUE;
        for(int[] p:points){
            for(int[] p1:points){
                if(p[0]==p1[0] || p[1]==p1[1])
                continue;
                if(map.get(p[0]).contains(p1[1]) && map.get(p1[0]).contains(p[1]))
                ans=Math.min(ans,Math.abs(p1[0]-p[0])*Math.abs(p1[1]-p[1]));
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
