class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String first = equations.get(i).get(0);
            String second = equations.get(i).get(1);
            if (!graph.containsKey(first)) {
                HashMap<String, Double> map = new HashMap<>();
                map.put(second, values[i]);
                graph.put(first, map);
            } else {
                HashMap<String, Double> map = graph.get(first);
                map.put(second, values[i]);
                graph.put(first, map);
            }
            if (!graph.containsKey(second)) {
                HashMap<String, Double> map = new HashMap<>();
                map.put(first, 1/values[i]);
                graph.put(second, map);
            } else {
                HashMap<String, Double> map = graph.get(second);
                map.put(first, 1/values[i]);
                graph.put(second, map);
            }
        }
        double[] res = new double[queries.size()];
        for (int i = 0; i< queries.size(); i++) {
            String curr = queries.get(i).get(0);
            String target = queries.get(i).get(1);
            if (!graph.containsKey(curr) || !graph.containsKey(target)) {
                res[i] = -1.0;
            } else {
                res[i] = dfs(graph, curr, target, new HashSet<String>());
            }
        }
        return res;
    }

    private double dfs(HashMap<String, HashMap<String, Double>> graph, String curr, String target, Set<String> visited) {
        if (curr.equals(target)) {
            return 1.0;
        }
        if (!graph.containsKey(curr)) {
            return -1;
        }
        visited.add(curr);
        for(Map.Entry<String, Double> e : graph.get(curr).entrySet()) {
            if (visited.contains(e.getKey())){
                continue;
            }
            double res = dfs(graph, e.getKey(), target, visited);
            if (res != -1) {
                return e.getValue() * res;
            }
        }
        return -1;
    }
    
}