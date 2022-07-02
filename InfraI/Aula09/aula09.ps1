foreach($nome in $(Get-Content -Path .\lista_nomes.txt)) {
	Write-Output "O nome eh $nome"

    if ($nome -eq "Pedro") {
        Write-Output "Encontrou $nome"
      } else {
         $outrosNomes++
      }
}
