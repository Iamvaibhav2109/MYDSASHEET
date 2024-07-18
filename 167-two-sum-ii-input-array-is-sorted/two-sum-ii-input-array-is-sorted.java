class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[]=new int [2];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++){
            int secondNumber=target-numbers[i];
            if(map.containsKey(secondNumber) && map.get(secondNumber) != i + 1){
                result[0]=i+1;
                result[1]=map.get(secondNumber);
                break;
            }
        }
        return result;
    }
}