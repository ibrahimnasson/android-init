#!/system/bin/sh

sh ./mobile-data-accessible.sh
if [ $? -eq 0 ]
then
  sh ./turn-on-wifi.sh
fi
