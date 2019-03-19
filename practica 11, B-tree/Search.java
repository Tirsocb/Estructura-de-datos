package com.company;

public class Search {


    public void split(Node papi, int Index, Node nChild){

        Node newNode = new Node();
        newNode.leaf = nChild.leaf;
        newNode.nNodes = 1;
        newNode.value[0] = nChild.value[2];


        if(!nChild.leaf){
            newNode.Child[1] = nChild.Child[3];
            newNode.Child[0] = nChild.Child[2];
        }
        nChild.nNodes = 1;


        for(int j = papi.nNodes+1; j>=Index+1; j--){
            papi.Child[j] = papi.Child[j-1];
            papi.value[j-1] = papi.value[j-2];
        }


        papi.Child[Index] = newNode;
        papi.value[Index-1] = nChild.value[1];
        papi.nNodes++;
    }


    public void full(Node node, String key){
        int a = node.nNodes;

        if(node.leaf){
            while(a>=1 && (key.compareTo(node.value[a-1])<0)){
                node.value[a] = node.value[a-1];
                a--;
            }
            node.value[a] = key;
            node.nNodes++;

        }else{
            while(a>=1 && (key.compareTo(node.value[a-1])<0)){
                a--;
            }
            a++;

            if(node.Child[a-1].nNodes == 3){

                split(node, a, node.Child[a-1]);

                if(key.compareTo(node.value[a-1])>0){
                    a++;
                }
            }

            full(node.Child[a-1], key);
        }
    }
}
