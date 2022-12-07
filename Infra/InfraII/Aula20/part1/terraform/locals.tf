locals {
  region = var.my_region

  common_tags = {
    Terraform = "true"
    Environment = "dev"
  }
}