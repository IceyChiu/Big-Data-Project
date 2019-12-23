hadoop jar /home/uic/hadoop-3.2.1/share/hadoop/tools/lib/hadoop-*streaming*.jar \
-file /home/uic/Big-Data-Project/task3/mapper1.py -mapper /home/uic/Big-Data-Project/task3/mapper1.py \
-file /home/uic/Big-Data-Project/task3/reducer1.py -reducer /home/uic/Big-Data-Project/task3/reducer1.py \
-input /data/project/* -output /output/project/task3/1

