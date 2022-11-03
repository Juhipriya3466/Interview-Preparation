class OrderedStream {
    int p=0;
    String[] res;
    public OrderedStream(int n) {
        res=new String[n];
        p=0;    
    }
    
    public List<String> insert(int idKey, String value) {
        res[idKey-1]=value;
        List<String> list=new ArrayList<String>();
        while(p<res.length && res[p]!=null)
        {
            list.add(res[p]);
            p++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */