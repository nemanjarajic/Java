package trieExample;
import java.util.*;

public class TrieNode {
    TrieNode[] arr;
    boolean isEnd;

    public TrieNode(){
        this.arr = new TrieNode[26];
    }
}
