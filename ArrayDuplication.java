class ArrayDuplication {
    public static void main(String args[]) {
        int[] a = {3,41,88,11,2,69};
        int[] b = new int[a.length];

        System.out.println("The actual array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            b[i] = a[i];
        }

        System.out.println("\nThe duplicate array is:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
