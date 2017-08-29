 Thread timer = new Thread()
        {
            public void run()
            {
                try{
                    sleep(3000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent("com.arqamrafay.splash.MENU");
                    startActivity(intent);
                }
            }
        };
        timer.start();