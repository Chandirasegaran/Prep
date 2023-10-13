#include <iostream>
#include <stdlib.h>
using namespace std;

struct listnode
{
    int data;
    listnode *next;
};

typedef struct listnode node;

node *Head = NULL;
class LinkedList
{
public:
    void displayList()
    {
        if (Head == NULL)
        {
            cout << "\nEmpty List\n";
            return;
        }
        node *temp = Head;
        cout << "\nList Contains: ";
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
    }

    void insertAtBeginning(int val)
    {
        node *newNode = (node *)malloc(sizeof(node));
        newNode->data = val;
        if (Head == NULL).
        {
            newNode->next = NULL;
            Head = newNode;
        }
        else
        {
            newNode->next = Head;
            Head = newNode;
        }
    }

    void insertAtEnd(int val)
    {
        node *newNode = (node *)malloc(sizeof(node));
        if (Head == NULL)
        {
            insertAtBeginning(val);
            return;
        }
        node *temp = Head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        newNode->data = val;
        newNode->next = NULL;
        temp->next = newNode;
    }

    void insertAtPosition(int val, int position)
    {
        if (position == 0)
        {
            insertAtBeginning(val);
            return;
        }
        node *newNode = (node *)malloc(sizeof(node));
        node *temp = Head;
        for (int i = 0; i < position - 1; i++)
        {
            temp = temp->next;
            if (temp == NULL)
            {
                cout << "\nInvalid Position";
            }
        }
        newNode->data = val;
        newNode->next = temp->next;
        temp->next = newNode;
    }

    void deleteAtPosition(int position)
    {
        if (Head == NULL)
        {
            cout << "Empty List\n";
            return;
        }

        node *temp = Head;
        node *prev = NULL;

        if (position == 0)
        {
            Head = Head->next;
            free(temp);
            return;
        }

        for (int i = 0; i < position; i++)
        {
            prev = temp;
            temp = temp->next;
            if (temp == NULL)
            {
                cout << "\nInvalid Position";
                return;
            }
        }

        prev->next = temp->next;
        free(temp);
    }
    void searchAtPosition(int position)
    {
        node *temp = Head;
        for (int i = 0; i < position; i++)
        {
            temp = temp->next;
            if (temp == NULL)
            {
                cout << "\nInvalid Position\n";
                return;
            }
        }
        cout << "\nThe Value at position \"" << position << "\" is " << temp->data << endl;
    }
};

int main()
{
    int choice, val, position;
    LinkedList list;
    while (1)
    {
        cout << "\n--------------------Linked List--------------------\n";
        cout << "1. Display\n";
        cout << "2. Insert at Beginning.\n";
        cout << "3. Insert at End.\n";
        cout << "4. Insert at Position.\n";
        cout << "5. Delete at Position.\n";
        cout << "6. Search at Position.\n";
        cout << "7. Exit\n";
        cout << "Enter your Choice: ";

        cin >> choice;

        switch (choice)
        {
        case 1:
            list.displayList();
            break;
        case 2:
            cout << "Enter the Value to Insert: ";
            cin >> val;
            list.insertAtBeginning(val);
            break;
        case 3:
            cout << "Enter the Value to Insert: ";
            cin >> val;
            list.insertAtEnd(val);
            break;
        case 4:
            cout << "Enter the Position: ";
            cin >> position;
            cout << "Enter the Value to Insert: ";
            cin >> val;
            list.insertAtPosition(val, position);
            break;
        case 5:
            cout << "Enter the Position to Delete: ";
            cin >> position;
            list.deleteAtPosition(position);
            break;
        case 6:
            cout << "Enter the Position to Search: ";
            cin >> position;
            list.searchAtPosition(position);
            break;
        case 7:
            exit(0);
            break;
        default:
            cout << "\n\nInvalid Choice!\n\n";
            break;
        }
    }
    return 0;
}