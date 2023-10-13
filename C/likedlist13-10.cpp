#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
    Node(int val)
    {
        data = val;
        next = NULL;
    }
};
class linkedlist
{

public:
    Node *head;
    linkedlist()
    {
        head = NULL;
    }
    void insert(int val)
    {
        Node *newNode = new Node(val);
        if (head == NULL)
        {
            head = newNode;
        }
        else
        {
            Node *temp = head;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }
    void display()
    {
        Node *temp = head;
        while (temp)
        {
            cout << temp->data << endl;
            temp = temp->next;
        }
    }
};
int main()
{

    linkedlist newobj;
    newobj.insert(21);
    newobj.insert(31);
    newobj.insert(41);
    newobj.display();
    return 0;
}