# output "s3_arn" {
#   description = "O ARN do S3"
#   value = aws_s3_bucket.meu_bucket.*.arn
# }

# output "s3_id" {
#   description = "O ID do S3"
#   value = aws_s3_bucket.meu_bucket.*.id
# }

output "private_security_group_arn" {
  description = "O Arn do Security Group"
  value = aws_security_group.allow_ssh_priv.arn
}

output "private_security_group_id" {
  description = "O ID do Security Group"
  value = aws_security_group.allow_ssh_priv.id
}

output "private_security_group_name" {
  description = "O name do Security Group"
  value = aws_security_group.allow_ssh_priv.name
}

output "pub_security_group_arn" {
  description = "O Arn do Security Group"
  value = aws_security_group.allow_ssh_pub.arn
}

output "pub_security_group_id" {
  description = "O ID do Security Group"
  value = aws_security_group.allow_ssh_pub.id
}

output "pub_security_group_name" {
  description = "O name do Security Group"
  value = aws_security_group.allow_ssh_pub.name
}