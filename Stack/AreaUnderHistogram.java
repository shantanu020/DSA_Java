package Stack;
import java.util.*;
// Approach

/*
 1. Find the previous smaller element - if found put -1 int the array else put the index of the element
 2. Find the next smaller element - if found put -1 int the array else put the index of the element
 3. Find the width by nextSmaller(i)-previousSmaller(i)-1;
 4. Find the area
 */
public class AreaUnderHistogram {
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        brute(heights);
        optimal(heights);
        
    }
     // BRUTE FORCE APPROACH- FIND EVERY POSSIBLE AREA FOR EACH ELEMENT 
    public static void brute(int [] heights){
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            int minHeight=heights[i];
            for(int j=i;j<n;j++){
                if(heights[j]<minHeight){
                    minHeight=heights[j];
                }
                if(maxArea<minHeight*(j-i+1)){
                    maxArea=minHeight*(j-i+1);
                }
            }
        }
        System.out.println("Maximum Area: "+maxArea);
    }
    // OPTIMAL- USE OF STACK
    // append 0 to the end of heights so that each height can be processed 
    // store the indexes of height in stack in non decreasing order of their height
    // while stack is not empty and current height is less than the top element in the stack.. 
    // pop the element and calculate the area for that element as smaller current height represents the edge of rectangle you can get from the element at the top of the stack
    // if stack is empty after poping the element width will be i; else width will be i- index of popped element (i.e i-stk.peek()-1)   
    public static void optimal(int [] heights){
        Stack<Integer> stk=new Stack<>();
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<=n;i++){
            int currentHeight=(i==n)?0:heights[i];
            while(!stk.empty()&&currentHeight<heights[stk.peek()]){
                int top=stk.pop();
                int height=heights[top];
                int width=stk.empty()?i:i-(stk.peek()+1);
                maxArea=Math.max(maxArea, height*width);
            }
            stk.push(i);
        }
        System.out.println("Maximum Area: "+maxArea);
    }


}
