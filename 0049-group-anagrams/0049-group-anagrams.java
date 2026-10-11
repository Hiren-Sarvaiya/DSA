class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      char[] t = s.toCharArray();
      Arrays.sort(t);
      String key = new String(t);

      map.putIfAbsent(key, new ArrayList<>());
      map.get(key).add(s);
    }

    return new ArrayList<>(map.values());
  }
}