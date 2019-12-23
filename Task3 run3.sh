hadoop jar /home/uic/hadoop-3.2.1/share/hadoop/tools/lib/hadoop-*streaming*.jar \
-file /home/uic/Big-Data-Project/task3/mapper3.py -mapper /home/uic/Big-Data-Project/task3/mapper3.py \
-file /home/uic/Big-Data-Project/task3/reducer3.py -reducer /home/uic/Big-Data-Project/task3/reducer3.py \
-input /output/project/task3/2/part-00000 -output /output/project/task3/3

