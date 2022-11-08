class UndergroundSystem {
    HashMap<Integer,Pair<String,Integer>> checkin=new HashMap<>();
    HashMap<String,Pair<Double,Integer>> route=new HashMap<>();
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkin.put(id,new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String,Integer> startjourney=checkin.get(id);
        checkin.remove(id);
        String str=startjourney.getKey()+"-"+stationName;
        int totaltime=t-startjourney.getValue();
        Pair<Double,Integer> routemap=route.getOrDefault(str,new Pair<>(0.0,0));
        route.put(str,new Pair<>(routemap.getKey()+totaltime,routemap.getValue()+1));     
    }
    
    public double getAverageTime(String startStation, String endStation) {
      String s=startStation+"-"+endStation;
        Pair<Double,Integer> trip=route.get(s);
        return trip.getKey()/trip.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */