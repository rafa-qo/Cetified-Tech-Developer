$sourcePath = "C:\Users\r.oliveira\OneDrive - Align Technology, Inc\Documents\Certified Tech Developer\InfraI\Aula09\teste\*"

$destinyPath = "C:\Users\r.oliveira\OneDrive - Align Technology, Inc\Documents\Certified Tech Developer\InfraI\Aula09\backup"

$date = Get-Date -Format d-M-yyy

Copy-Item $sourcePath $destinyPath -Recurse -Verbose *> "$destinyPath\log-$date.txt"