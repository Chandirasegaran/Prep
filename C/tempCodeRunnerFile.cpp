#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node (int val){
        data=val;
        next=NULL;
    }
};
class linkedlist{
    
    public:
    Node * head;
    linkedlist(){
        head=NULL;
    }
    void insert (int val){
            Node * newNode=new Node(val);
        if(head==NULL){
            head=newNode;
        }
        else{
            Node * temp=head;
            while (temp->next!=NULL){
                temp=temp->next;
            }
            newNode=temp->next;
            newNode->data=val;
            newNode->next=NULL;
            
        }
    }
    // void display(){
    //     while (Node)
    //     {
    //         count(Node->val);
    //     }
        
    // }
};
int main()
{
      
  linkedlist newobj=new linkedlist();
  newobj.insert(21);
  newobj.insert(31);
  newobj.insert(41);
    return 0;
}