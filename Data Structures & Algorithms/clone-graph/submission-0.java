class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        // Create clone of starting node
        map.put(node, new Node(node.val));
        q.offer(node);

        while (!q.isEmpty()) {

            Node n = q.poll();

            for (Node nd : n.neighbors) {

                // If neighbor is not cloned yet
                if (!map.containsKey(nd)) {
                    map.put(nd, new Node(nd.val));
                    q.offer(nd);
                }

                // Add cloned neighbor
                map.get(n).neighbors.add(map.get(nd));
            }
        }

        return map.get(node);
    }
}