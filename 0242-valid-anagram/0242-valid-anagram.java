class Solution {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> mapS = new HashMap<>();
    Map<Character, Integer> mapT = new HashMap<>();

    for (int i = 0; i < s.length(); i++)
      mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
    for (int i = 0; i < t.length(); i++)
      mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    
    if (mapS.size() != mapT.size())
      return false;

    for (char c : mapS.keySet()) {
      if (mapS.get(c).intValue() != mapT.getOrDefault(c, 0).intValue())
        return false;
    }

    return true;
  }
}