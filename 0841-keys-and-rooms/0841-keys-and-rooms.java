class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        vis[0] = true;

        Queue<Integer> q = new LinkedList<>();
        q.addAll(rooms.get(0));

        while (!q.isEmpty()) {
            int room = q.poll();
            if (!vis[room]) {
                vis[room] = true;
                q.addAll(rooms.get(room));
            }
        }

        for (boolean b : vis) {
            if (!b) return false;
        }

        return true;
    }
}