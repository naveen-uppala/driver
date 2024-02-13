#!/bin/bash 
cd /K8s-Deployment
kustomize edit set image 533266968694.dkr.ecr.ap-south-1.amazonaws.com/customer:default_tag=${REPOSITORY_URI} && kubectl apply -k .
