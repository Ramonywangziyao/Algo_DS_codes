
  public int read(char[] buf, int n) {
        char [] tmp = new char[4];
        int ct, sum = 0, eof = 0;
        while(eof == 0) {
            ct = read4(tmp);
            if(ct < 4) eof = 1;
            ct = Math.min(ct,n - sum);
            for(int i = 0; i < ct; i++) buf[sum++] = tmp[i];
        }
        return sum;
    }
