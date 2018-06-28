class Solution {
    class Node{
        String str;
        int distance;

        public Node(String str, int distance){
            this.str=str;
            this.distance=distance;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node> BFS = new LinkedList<>();
        Set<String> wordsLeft = new HashSet<String>(wordList);
        BFS.add(new Node(beginWord,1));
        while(!BFS.isEmpty()){
            Node node = BFS.remove();
            int distance = node.distance;
            StringBuilder currentWord = new StringBuilder(node.str);
            if(currentWord.toString().equals(endWord)){
                return distance;
            }
            for(int i=0;i<currentWord.length();++i){
                char c = currentWord.charAt(i);
                for(int j=0; j<26;++j){
                    char o= (char)(j+'a');
                    if(c!=o){
                        currentWord.setCharAt(i,o);
                        if(wordsLeft.contains(currentWord.toString())){
                            wordsLeft.remove(currentWord.toString());
                            BFS.add(new Node(currentWord.toString(),distance+1));
                        }
                        currentWord.setCharAt(i,c);
                    }
                }
            }
        }

        return 0;
    }

}
