class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // to store the used bricks

        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) { 
                if (ladders > 0) {
                    minHeap.offer(diff);
                    ladders--;
                } else if (!minHeap.isEmpty() && minHeap.peek() < diff) {
                    bricks -= minHeap.poll();
                    minHeap.offer(diff);
                } else {
                    bricks -= diff;
                }

                if (bricks < 0) {
                    return i;
                }
            }
        }

        return heights.length - 1;
    }
}

