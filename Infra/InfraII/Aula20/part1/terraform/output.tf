output "url_banco_de_dados" {
    description = "URl do Banco de Dados RDS"
    value = module.db.db_instance_address
}