package Stacks;
import java.util.*;

public class sortStack {
    public static void main(String args[]){

    }

    public static void insertSort(Stack<Integer> st,int val){
        if(st.isEmpty() || val>st.peek()){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertSort(st,val);
        st.push(top);
    }

    public static void sort(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        sort(st);
        insertSort(st,top);
    }
}
