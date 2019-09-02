# demo-docker-file

สร้าง Spring boot + docker file

Example Build DockerFile

จากตัวอย่างใน Project จะมี DockerFile อยู่ 2 File คือ DockerFile และ test.DockerFile<br>
โดยจะทำการทดสอบ build จาก default file และกณีเปลี่ยนชื่อ dockerfile

---

### กรณีที่เราสร้าง dockerfile ไว้ใน Project เป็นชื่อ default ใช้ command นี้ในการสั่ง build  <br>
โดย docker จะทำการค้นหาไฟล์ ที่ชื่อ "dockerfile" เอง<br>
** cd เข้าไปที่ Path ที่ dockerfile อยู่ ในที่นี้คือ dockerfile อยู่ใน project

```shell
cd demo-docker-file
docker build -t demo-docker .
```
### กรณีที่เรา ใช้ command นี้ในการสั่ง build
โดย -f จะเป็นการระบุชื่อ dockerfile
** cd เข้าไปที่ Path ที่ dockerfile อยู่ ในที่นี้คือ dockerfile อยู่ใน project

```shell
cd demo-docker-file
docker build -t demo-docker . -f test.dockerfile
```


