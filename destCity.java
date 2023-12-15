class Solution {
    public String destCity(List<List<String>> paths) 
    {
        HashSet<String> allCity=new HashSet<>();
        for(List<String> e : paths)
        {
            allCity.add(e.get(0));
            allCity.add(e.get(1));
        }
        for(List<String> e : paths)
        {
            if(allCity.contains(e.get(0)))
            allCity.remove(e.get(0));
        }
        String finalDestination="";
        for(String e : allCity)
        {
            finalDestination=e;
        }
        return finalDestination;
        
    }
}
