!/bin/bash
curl -f -L -H 'Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiIyVVhXYUUzb1JyY0siLCJhdWQiOiJjaXJjbGV0LXdlYi11aSIsIm9yZ0RvbWFpbiI6InRhbGVudHBsdXMiLCJuYW1lIjoiYnBheHRvbiIsImlzcyI6Imh0dHBzOlwvXC90YWxlbnRwbHVzLmpldGJyYWlucy5zcGFjZSIsInBlcm1fdG9rZW4iOiI0ZjFRUU8zY0Mxb24iLCJwcmluY2lwYWxfdHlwZSI6IlVTRVIiLCJpYXQiOjE2NTE2MDM0NDV9.NbsswPzYboCDpV8zNf_hhbBIK-cXz-KamycWdbPEuMdfpT_MzDhMbt9avih1D7WKzBpzc91m_7xhlunbpdqPUGV_8_urqLtcu1h229UUdguk5TgDxWhgg_bwuF3iCAYJplHOldLFD5-7dhokIFLfnmnRy4fqn5tB1_eVXcVZBcU' -o /mnt/space/work/jdk7 'https://files.pkg.jetbrains.space/talentplus/p/tb-6/jdk7/7.0.232-zulu.zip' ;
unzip ./jdk7;
mv 7.0.232-zulu/ /usr/lib/jvm/java-7.0.232;

