#!/system/bin/sh

while true
do
  HOUR=$(date +%H)

  if [ "$HOUR" -ge 3 -a "$HOUR" -le 5 ]
  then
    sh "./start-activity.sh" org.gemini.media_scanner .MediaScannerActivity
    sh "./wait-process.sh" "org.gemini.media_scanner"
  fi

  sleep 3600
done
