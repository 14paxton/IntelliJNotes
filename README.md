 

Groups HTTP Request Scripts

### create GROUP_COMPARE
POST http://192.168.12.26:18080/am/userGroups/v1/group/compareContent-Type: application/json

{
  "id"  :null ,
  "name": "GETGUD",
  "type": "GROUP_COMPARE",
  "groupIds": [520, 518],
  "assessmentOrderIds": null
}
### update GROUP_COMPARE
POST http://192.168.12.26:8080/am/userGroups/v1/group/compareContent-Type: application/json

{
  "id" : 599,
  "name": "GETBETTER",
  "type": "GROUP_COMPARE",
  "groupIds": [520, 372, 518],
  "assessmentOrderIds": []
}

### SHARE
POST http://192.168.12.26:8080/am/userGroups/v1/599/shareContent-Type: application/json

{
  "userIds" : [124554, 124555, 124556]
}

### DELETE
DELETE http://192.168.12.26:8080/am/userGroups/v1/599###create RESULT_SHARE
POST http://192.168.12.26:8080/am/userGroups/v1/group/compareContent-Type: application/json

{
  "name": "IRONTOM",
  "type": "RESULT_COMPARE",
  "groupIds": [519],
  "assessmentOrderIds": [35075, 45481]
}

<> 2021-11-10T090930.500.json
### update RESULT_SHARE
POST http://192.168.12.26:8080/am/userGroups/v1/groupContent-Type: application/json

{
  "id" : 564,
  "name": "KIDMIDNIGHT",
  "type": "RESULT_COMPARE",
  "groupIds": null,
  "assessmentOrderIds": [71539,
    71516,
    71496,
    71476,
    71456]
}

