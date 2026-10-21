class Solution {
  public boolean isValidSudoku(char[][] board) {
    HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
    HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
    HashMap<Pair<Integer, Integer>, HashSet<Character>> sqrs = new HashMap<>();
    HashSet<Character> em = new HashSet<>();

    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[0].length; c++) {
        if (board[r][c] == '.')
          continue;

        if (rows.getOrDefault(r, em).contains(board[r][c]) ||
            cols.getOrDefault(c, em).contains(board[r][c]) ||
            sqrs.getOrDefault(new Pair<Integer, Integer>(r / 3, c / 3), em).contains(board[r][c]))
          return false;

        rows.putIfAbsent(r, new HashSet<>());
        cols.putIfAbsent(c, new HashSet<>());
        sqrs.putIfAbsent(new Pair<Integer, Integer>(r / 3, c / 3), new HashSet<>());

        rows.get(r).add(board[r][c]);
        cols.get(c).add(board[r][c]);
        sqrs.get(new Pair<Integer, Integer>(r / 3, c / 3)).add(board[r][c]);
      }
    }

    return true;
  }
}