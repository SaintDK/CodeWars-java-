package kyu_8.Difference_of_Volumes_of_Cuboids;

interface CuboidVolumes {
    static int findDifference(int[] a, int[] b) {
        return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
    }
}