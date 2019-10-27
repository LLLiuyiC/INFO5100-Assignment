package Assignment6.Q5;

public class MyHashMap {
    private MyList[] l = new MyList[10001];
    private int key;
    private int value;

    int getHash(int key) {
        //return Integer.hashCode(key) % l.length;
        return key/100;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        if (l[index] == null) {
            MyList next = new MyList(key, value, null);
            l[index] = next;
        } else {
            MyList temp = l[index];
            MyList pre = new MyList(-1,-1,null);
            pre.next=temp;
            while (temp != null) {
                if (temp.key == key) {
                    temp.value = value;
                    return;
                }
                temp=temp.next;
                pre = pre.next;
            }
            boolean isEmpty = false;
            if(temp==null) isEmpty=true;
            System.out.println(isEmpty);
            MyList next = new MyList(key, value, null);
            pre.next = next;

        }
    }

    public int get(int key) {
        int index = getHash(key);
        MyList temp = l[index];
        if (temp == null) {

            return -1;
        } else {
            while (temp != null) {
                if (temp.key == key) {

                    return temp.value;
                }
                temp = temp.next;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int index = getHash(key);
        if (l[index] == null) return;
        MyList pre = new MyList(0, 0, null);
        pre.next = l[index];
        MyList preHead = pre;
        MyList temp = l[index];
        while (temp != null) {
            if (temp.key == key) {

                pre.next = pre.next.next;

                l[index] = preHead.next;

                return;
            }
            pre = pre.next;
            temp = temp.next;
        }

    }

    class MyList {
        private int key;
        private int value;
        private MyList next;

        public MyList(int key, int value, MyList next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }
}
